
solution {
    puzzle = "P015"
    name = "B F TI12 G SPEED"
    arm(ARM6) {
        number = 1
        position = 1 to 0
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 2 to -3
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 3 to -3
        rotation = 1
    }
    glyph(PROJECTION) {
        position = 1 to -1
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 2 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
