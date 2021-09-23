
solution {
    puzzle = "w2501727808"
    name = "NEW SOLUTION 1"
    arm(ARM1) {
        number = 1
        position = -7 to -4
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -8 to -6
        rotation = 8
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -4 to -4
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -1 to -3
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -3 to 3
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = -7 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = -4 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = -5 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -6 to -6
        rotation = 1
    }
    glyph(PROJECTION) {
        position = -6 to -4
        rotation = 7
    }
    glyph(DISPOSAL) {
        position = -6 to -8
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -5 to -3
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -8 to -5
        rotation = 6
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
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
                wait(2)
                grab()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
            }
        }
        )
    }
}
