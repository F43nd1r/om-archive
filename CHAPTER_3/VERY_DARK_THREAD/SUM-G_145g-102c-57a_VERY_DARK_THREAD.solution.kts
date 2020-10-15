
solution {
    puzzle = "P029"
    name = "B X S 6T"
    arm(ARM1) {
        number = 1
        position = -2 to 1
        rotation = 2
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -2 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 1 to -3
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -2 to -2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -3 to 1
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -3 to 0
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -3 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -3 to 2
        rotation = 0
    }
    track {
        position = 1 to -3
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(2)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                pivotClockwise()
                forward()
                forward()
                reset()
                wait(4)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                repeat()
                wait(15)
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                pivotClockwise()
                forward()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                forward()
                back()
                reset()
            }
        }
        )
    }
}
