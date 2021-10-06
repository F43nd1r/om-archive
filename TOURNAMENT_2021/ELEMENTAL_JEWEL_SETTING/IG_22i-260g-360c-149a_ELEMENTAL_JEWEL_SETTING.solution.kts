
solution {
    puzzle = "w2450512809"
    name = "NEW SOLUTION 1"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -9 to 4
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -11 to -3
        rotation = 1
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = -11 to 2
        rotation = -2
        size = 2
    }
    arm(ARM6) {
        number = 4
        position = -6 to -2
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 5
        position = -7 to 3
        rotation = -2
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = -6 to -1
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = -9 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -9 to 0
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -9 to 3
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = -8 to 3
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = -8 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -12 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(7)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(7)
                grab()
                retract()
                drop()
                wait(1)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                drop()
                wait(6)
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
