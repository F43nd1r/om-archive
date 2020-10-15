
solution {
    puzzle = "P031b"
    name = "B S"
    arm(ARM1) {
        number = 1
        position = -2 to 3
        rotation = 4
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = 3 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 5 to -3
        rotation = 1
        size = 1
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 4 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 3 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
                repeat()
                wait(2)
                repeat()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
