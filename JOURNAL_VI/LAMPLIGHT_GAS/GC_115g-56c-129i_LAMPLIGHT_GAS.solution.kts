
solution {
    puzzle = "P092"
    name = "B CC NOGIF"
    arm(ARM1) {
        number = 1
        position = 7 to 3
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 8 to 2
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 8 to 1
        rotation = 2
        size = 3
    }
    glyph(CALCIFICATION) {
        position = 3 to 3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 4 to 4
        rotation = 4
    }
    io(INPUT) {
        index = 0
        position = 5 to 5
        rotation = 4
    }
    io(OUTPUT) {
        index = 0
        position = 5 to 1
        rotation = -1
    }
    track {
        position = 7 to 2
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    track {
        position = 6 to 3
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                forward()
                drop()
                rotateClockwise()
                wait(5)
                forward()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                forward()
                drop()
                rotateClockwise()
                wait(5)
                forward()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                forward()
                drop()
                rotateClockwise()
                wait(5)
                forward()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(8)
                repeat()
                wait(8)
                repeat()
                wait(8)
                repeat()
                wait(8)
                grab()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(8)
                forward()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                forward()
                drop()
                rotateClockwise()
                wait(5)
                repeat()
                wait(17)
                forward()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                forward()
                drop()
            }
        }
        )
    }
}
