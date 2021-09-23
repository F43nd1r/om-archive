
solution {
    puzzle = "w2501727808"
    name = "TIG 16"
    arm(ARM1) {
        number = 1
        position = -1 to -7
        rotation = -5
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -3 to -6
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 4 to -8
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 3 to -4
        rotation = -6
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -3 to 0
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -7
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to -4
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -2 to -7
        rotation = -1
    }
    glyph(PROJECTION) {
        position = 0 to -8
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = -3 to -8
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to -8
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -2 to -6
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(1)
                grab()
                pivotClockwise()
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
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
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
            sequence(4) {
                wait(15)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
