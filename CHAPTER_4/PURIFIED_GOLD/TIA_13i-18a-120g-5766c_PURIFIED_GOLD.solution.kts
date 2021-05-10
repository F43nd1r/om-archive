
solution {
    puzzle = "P036"
    name = "NEW SOLUTION 10"
    arm(ARM6) {
        number = 1
        position = -10 to -4
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -8 to -3
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -9 to -5
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -10 to -2
        rotation = -2
        size = 1
    }
    glyph(PURIFICATION) {
        position = -9 to -3
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = -9 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = -8 to -5
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                extendTape()
            }
        }
        )
    }
}
