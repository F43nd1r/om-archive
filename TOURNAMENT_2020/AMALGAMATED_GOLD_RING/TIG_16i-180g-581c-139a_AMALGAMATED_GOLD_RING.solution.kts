
solution {
    puzzle = "w2501727808"
    name = "TIC 16"
    arm(ARM6) {
        number = 1
        position = -9 to -1
        rotation = -3
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -12 to -2
        rotation = 1
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
        rotation = -13
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -3 to 3
        rotation = 7
        size = 2
    }
    glyph(BONDER) {
        position = -8 to -1
        rotation = 0
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
        position = -10 to -2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -8 to -2
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = -10 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -5 to -3
        rotation = -4
    }
    io(INPUT) {
        index = 1
        position = -11 to 0
        rotation = -1
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
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(15)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(13)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                grab()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
