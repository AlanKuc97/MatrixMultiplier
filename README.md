# MatrixMultiplier

## Requirements:

Installed Java
Installed Gradle (tested on version 6.6.1)

## How to run:

1. git clone https://github.com/AlanKuc97/MatrixMultiplier.git

2. cd MatrixMultiplier

3. gradle run --args='*size_of_matrix* *first_matrix_filename*.txt *second_matrix_filename*.txt'

Default example: gradle run --args='5 firstMatrix.txt secondMatrix.txt'

## NOTE: 
*size_of_matrix* argument makes program read only provided size matrix. 

That means, if you provide 3 as a size, program will read only 3x3 matrix (even if file contains 1000x1000 matrix).

If you provide too large size (for example: 10, but file contains 5x5 matrix) you will get an error.
