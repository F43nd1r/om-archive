
solution {
    puzzle = "P012"
    name = "B F SPEED"
    arm(ARM6) {
        number = 1
        position = 1 to 0
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 4 to -2
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = -1
    }
    glyph(PROJECTION) {
        position = 4 to -1
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 4 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 5 to -3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(5)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                repeat()
            }
        }
        )
    }
}
