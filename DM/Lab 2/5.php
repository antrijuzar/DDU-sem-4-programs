<?php
    $arr1 = array('A','B','C','D');
    $arr2 = array('C','D','E','F');

    $union = array_unique(array_merge($arr1,$arr2));
    echo "UNION : ";
    foreach($union as $i){
        echo $i, " ";            
    }

    $intersect = array_intersect($arr1,$arr2);
    echo "<br>","INTERSECTION : ";
    foreach($intersect as $i){
        echo $i, " ";
    }
    
    $difference = array_diff($arr1,$arr2); 
    echo "<br>","ARRAY1 - ARRAY2 :   ";
    foreach($difference as $i){
        echo $i, " ";
    }

    $difference = array_diff($arr2,$arr1); 
    echo "<br>","ARRAY2 - ARRAY1 :   ";
    foreach($difference as $i){
        echo $i, " ";
    }

?>