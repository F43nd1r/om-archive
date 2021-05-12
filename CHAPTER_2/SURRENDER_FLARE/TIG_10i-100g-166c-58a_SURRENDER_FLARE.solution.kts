
solution {
    puzzle = "P022"
    name = "NO-TRACK I-10 (COPY) (Copy)"
    arm(ARM1) {
        number = 1
        position = 3 to -3
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 2 to -4
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 4 to -4
        rotation = -4
        size = 2
    }
    glyph(BONDER) {
        position = 5 to -4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to -1
        rotation = -4
    }
    glyph(PROJECTION) {
        position = 4 to -2
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 0 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 6 to -6
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 2 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
