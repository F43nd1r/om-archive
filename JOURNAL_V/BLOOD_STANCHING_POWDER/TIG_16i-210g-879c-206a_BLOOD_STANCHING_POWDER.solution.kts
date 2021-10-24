
solution {
    puzzle = "P087"
    name = "NEW SOLUTION 2"
    arm(ARM6) {
        number = 1
        position = -5 to -5
        rotation = 2
        size = 1
    }
    arm(ARM2) {
        number = 2
        position = -6 to -3
        rotation = 3
        size = 1
    }
    arm(ARM2) {
        number = 3
        position = -1 to -1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -8 to 6
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 5
        position = -9 to 4
        rotation = 5
        size = 2
    }
    glyph(BONDER) {
        position = -4 to -6
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = 3
    }
    glyph(MULTI_BONDER) {
        position = -4 to -2
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = -5 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 0
        rotation = 4
    }
    io(INPUT) {
        index = 1
        position = -5 to -6
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                wait(2)
                extendTape()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                extend()
                drop()
                retract()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
