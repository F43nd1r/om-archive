
solution {
    puzzle = "w2450512809"
    name = "NEW SOLUTION 1"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -3 to -4
        rotation = 2
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 1 to -4
        rotation = 2
        size = 2
    }
    arm(ARM6) {
        number = 3
        position = -4 to 1
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = -3 to 1
        rotation = 0
        size = 2
    }
    arm(ARM2) {
        number = 5
        position = 3 to 2
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -1 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = 2
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -2 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -5
        rotation = -7
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 5
        rotation = -1
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(1) {
                wait(3)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(10)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
