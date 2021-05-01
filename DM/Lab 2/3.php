<?php
   $a = array(78, 60, 62, 68, 81, 68, 73, 85, 66, 64, 76, 63, 75, 76,
   73, 68, 62, 73, 72, 65, 74, 62, 62, 65, 64, 68, 73, 75, 79, 73);
   echo "Average = " . array_sum($a)/count($a) . "\n";
    sort($a);
    echo "<br>";
    echo "List of five lowest temperatures : ";
   $a = array_unique($a);
   sort($a);
    for($i=0;$i<5;$i++){
        echo $a[$i]." " ;
    }
    echo "<br>";

    rsort($a);
    echo "List of five highest temperatures : ";
    for($i=0;$i<5;$i++){
        echo $a[$i]." " ;
    }
?>