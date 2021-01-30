my @hrefs = ();
 
while (<>) {
 
    my $line = $_;

    $line =~ s/(\<a.*href=\")([^\"]*)(\".*\>)/$2/g;

    print $line;

    $line =~ s/(^.*\/\/)?([^\/\:]*)([\/\:].*$)?/$2/g;
 
    push (@hrefs, $line);
}
 
sub uniq {
    my %seen;
    grep !$seen{$_}++, @_;
}

my @result = uniq(@hrefs);
my @sorted = sort(@result);

foreach my $href (@sorted) {
    print $href;
}
