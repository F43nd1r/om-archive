
solution {
    puzzle = "P087"
    name = "NEW SOLUTION 1"
    arm(ARM6) {
        number = 1
        position = -11 to 5
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -10 to 4
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -4 to 0
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = -3 to 2
        rotation = -4
        size = 1
    }
    arm(ARM6) {
        number = 5
        position = 4 to 0
        rotation = -1
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = 2 to 6
        rotation = -3
        size = 3
    }
    glyph(BONDER) {
        position = -12 to 6
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to 4
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = -2 to 5
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = -5 to 7
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to 7
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to 5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = -3
    }
    io(INPUT) {
        index = 1
        position = -12 to 5
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                wait(7)
                extendTape()
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
            sequence(3) {
                grab()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(7)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                grab()
                retract()
                drop()
                grab()
                extend()
                drop()
            }
        }
        )
    }
}
