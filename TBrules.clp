(defrule find-StudyOID
?ins <- (object (is-a ClinicalData)
(StudyOID $?find))
=>
(printout t "StudyOID in instance "
(instance-name ?ins)
" is " ?find crlf))