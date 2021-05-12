
solution {
    puzzle = "P014"
    name = "NO-TRACK I-6"
    arm(ARM6) {
        number = 1
        position = 4 to -2
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 3 to -2
        rotation = -4
        size = 3
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = 6 to -1
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -1 to 1
        rotation = -3
    }
    io(INPUT) {
        index = 1
        position = 4 to -4
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        )
    }
}
