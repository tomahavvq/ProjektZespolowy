group { 'puppet': ensure => 'present' }

package { 'software-properties-common': ensure => 'installed' }

include apt

::apt::ppa {'ppa:cwchien/gradle': }
Class['apt::update'] -> package { 'gradle-2.5': ensure => 'installed' }

file { '/etc/profile.d/append-gradle-path.sh':
  mode    => 644,
  content => 'PATH=$PATH:/opt/gradle-2.5/gradle-2.5/bin',
}

class { 'oracle_java':
  version => '8u45',
  type    => 'jdk'
}

file { '/etc/profile.d/append-java-path.sh':
  mode    => 644,
  content => 'PATH=$PATH:/usr/java/default/bin',
}

class { "maven::maven":
  version => "3.3.3",
}

class { 'mysql::server':
  root_password => 'admin',
}

mysql::db { 'projektzespolowy':
  user     => 'admin',
  password => 'admin',
  host	   => 'localhost',
  grant	   => ['ALL'],
}

