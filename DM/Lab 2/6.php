<?php  
if($_SERVER["REQUEST_METHOD"]=="POST"){
    $str=$_POST['txt'];


    function isPalindrome($str) {
        if(!strcasecmp($str,strrev($str))){
            return true;
        }   
        return false;
    }

    if(isPalindrome($str)){
        echo $str,' is a palindrome string';
    }
    else{
        echo $str,' is not a palindrome string';
    }

}
?>