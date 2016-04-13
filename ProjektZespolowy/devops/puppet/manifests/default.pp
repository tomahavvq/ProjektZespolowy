group { 'puppet': ensure => 'present' }

package { 'software-properties-common': ensure => 'installed' }

include apt

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


