<?php

$value = json_decode(file_get_contents('php://input'), true);



$to_client['test'] = "hello coil";

echo json_encode($to_client);



?>