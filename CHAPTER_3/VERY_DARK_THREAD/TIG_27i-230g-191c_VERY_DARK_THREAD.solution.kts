
solution {
    puzzle = "P029"
    name = "NEW SOLUTION 5"
    arm(ARM6) {
        number = 1
        position = -9 to -5
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 2
        position = -8 to -8
        rotation = -1
        size = 1
    }
    arm(ARM3) {
        number = 3
        position = -5 to -8
        rotation = 4
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = -4 to -6
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -3 to -6
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = -7 to -8
        rotation = 0
    }
    glyph(BONDER) {
        position = -7 to -6
        rotation = 0
    }
    glyph(BONDER) {
        position = -6 to -5
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -6 to -7
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -9 to -6
        rotation = -2
    }
    glyph(PROJECTION) {
        position = -8 to -6
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -5 to -9
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -7 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -9 to -8
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -10 to -5
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(8)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(10)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(4) {
                wait(15)
                grab()
                pivotClockwise()
                retract()
                pivotClockwise()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(13)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
            }
        }
        )
    }
}
