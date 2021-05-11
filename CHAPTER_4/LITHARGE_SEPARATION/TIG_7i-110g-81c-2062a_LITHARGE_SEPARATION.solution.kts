
solution {
    puzzle = "P031b"
    name = "INSTRUCTIONS NO TRACK 9"
    arm(ARM6) {
        number = 1
        position = -2 to 1
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = 2 to -1
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = -4 to 5
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -5 to 4
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -2 to 4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -4 to 4
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -5 to 2
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 1 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                pivotCounterClockwise()
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
