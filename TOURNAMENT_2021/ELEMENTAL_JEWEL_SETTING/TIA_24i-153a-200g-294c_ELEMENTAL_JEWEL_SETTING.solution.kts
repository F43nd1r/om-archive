
solution {
    puzzle = "w2450512809"
    name = "NEW SOLUTION 1"
    arm(ARM6) {
        number = 1
        position = 0 to -5
        rotation = 6
        size = 2
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = -4 to -1
        rotation = 4
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -3 to 0
        rotation = 5
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = 3 to 1
        rotation = -1
        size = 3
    }
    arm(PISTON) {
        number = 5
        position = 4 to -2
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = -1 to -3
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = 5
    }
    glyph(DUPLICATION) {
        position = -3 to -2
        rotation = 5
    }
    io(INPUT) {
        index = 0
        position = -2 to -4
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 5
        rotation = -1
    }
    tape {
        parallel(
        {
            sequence(1) {
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
            sequence(2) {
                wait(2)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(8)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(10)
                grab()
                extend()
                retract()
                drop()
                grab()
                extend()
                reset()
            }
        }
        )
    }
}
