
solution {
    puzzle = "P031b"
    name = "INSTRUCTIONS NO TRACK 13"
    arm(ARM6) {
        number = 1
        position = 0 to 3
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -1 to 4
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = -2 to 7
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -4 to 7
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to 6
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 3 to 3
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
                wait(70)
                grab()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
