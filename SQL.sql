-- This code will ask the user for their name and greet them
DECLARE @name varchar(50)

-- Ask the user for their name
PRINT 'Please enter your name:'
SET @name = 
CAST(Upper(Input('', 'varchar')) as varchar(50))

-- Greet the user
PRINT 'Hello ' + @name + ', nice to meet you!'