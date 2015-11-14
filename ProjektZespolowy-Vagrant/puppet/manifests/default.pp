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
  version => '8u51',
  type    => 'jdk'
}

file { '/etc/profile.d/append-java-path.sh':
  mode    => 644,
  content => 'PATH=$PATH:/usr/java/default/bin',
}

class { "maven::maven":
  version => "3.3.3",
}

class { 'postgresql::server':
  ip_mask_deny_postgres_user => '0.0.0.0/32',
  ip_mask_allow_all_users    => '0.0.0.0/0',
  listen_addresses           => '*',
  postgres_password          => 'pg',
}

postgresql::server::db { 'pg':
  user     => 'pg',
  password => postgresql_password('pg', 'pg'),
}
