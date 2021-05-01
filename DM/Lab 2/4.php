<?php

$birthdate = strtotime("12-09-2001");
$today =  strtotime(date('Y-m-d H:i:s'));

$fixedBirthdate = date_create(date("Y", $today) . "-" . date("m", $birthdate) . "-" . date("d", $birthdate));


$diff = date_diff(date_create(date("d-m-Y", $today)), $fixedBirthdate);
echo $diff->format("%R%a days");
?>