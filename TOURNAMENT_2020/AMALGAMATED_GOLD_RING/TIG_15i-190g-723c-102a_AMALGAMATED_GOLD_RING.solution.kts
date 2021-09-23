
solution {
    puzzle = "w2501727808"
    name = "TIC 15"
    arm(ARM6) {
        number = 1
        position = -9 to 3
        rotation = -3
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -12 to 2
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -6 to 0
        rotation = 1
        size = 2
    }
    arm(ARM2) {
        number = 4
        position = -4 to -1
        rotation = -14
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 0 to -3
        rotation = 4
        size = 2
    }
    glyph(BONDER) {
        position = -8 to 3
        rotation = 0
    }
    glyph(BONDER) {
        position = -4 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -10 to 2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -8 to 2
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = -10 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -6 to 3
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 1
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = -11 to 4
        rotation = -1
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
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
                wait(14)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(16)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
