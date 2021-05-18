
solution {
    puzzle = "P062"
    name = "NEW SOLUTION 1"
    arm(ARM3) {
        number = 1
        position = 4 to -5
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 6 to -5
        rotation = 0
        size = 1
    }
    arm(ARM2) {
        number = 3
        position = 3 to -3
        rotation = -1
        size = 2
    }
    glyph(BONDER) {
        position = 7 to -6
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 4 to -1
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 5 to -6
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -23 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 6 to -6
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        )
    }
}
