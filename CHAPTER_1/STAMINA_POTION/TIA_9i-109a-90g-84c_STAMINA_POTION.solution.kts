
solution {
    puzzle = "P015"
    name = "NO-TRACK I-12 (Copy)"
    arm(ARM3) {
        number = 1
        position = -1 to 1
        rotation = 1
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = -4 to 0
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -1 to -3
        rotation = 1
    }
    glyph(PROJECTION) {
        position = -4 to 3
        rotation = -5
    }
    io(INPUT) {
        index = 0
        position = -7 to 3
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -2
        rotation = -7
    }
    io(INPUT) {
        index = 1
        position = -1 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -1 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
