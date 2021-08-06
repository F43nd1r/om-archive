
solution {
    puzzle = "P026"
    name = "NEW SOLUTION 5"
    arm(ARM3) {
        number = 1
        position = -13 to -4
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = -17 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -16 to 0
        rotation = -2
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = -15 to -3
        rotation = 0
        size = 3
    }
    arm(ARM3) {
        number = 5
        position = -15 to -4
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 6
        position = -12 to -6
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -18 to 0
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -16 to -4
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -18 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -18 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -18 to -3
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -13 to -5
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -16 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -13 to -8
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -14 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -12 to -5
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(6)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
