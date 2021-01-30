my $text = "";
my $wasempty = 0;
 
while (<>) {
 
    my $line = $_;

    $line =~ s/(\<)([^\>])*(\>)//g;
 
    $line =~ s/^( )*//;
    $line =~ s/( )*$//;
    $line =~ s/ ( )+/ /g;
 
    if ($line eq "\n") {
        if ($wasempty == 1) {
            next;
        }
        $wasempty = 1;
    } else {
        $wasempty = 0;
    }
 
    $text = $text.$line;
}
 
$text =~ s/^(\n)*//;
$text =~ s/(\n)*$//;
 
print $text;