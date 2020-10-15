
solution {
    puzzle = "P015"
    name = "B S 8T"
    arm(ARM6) {
        number = 1
        position = -1 to -2
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -4 to 0
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = -1
    }
    glyph(PROJECTION) {
        position = -3 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -6 to 0
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -2
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = -2 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -3 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(1)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(7)
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                pivotClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                grab()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotClockwise()
                drop()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
