
solution {
    puzzle = "P029"
    name = "B X S 6T"
    arm(ARM6) {
        number = 1
        position = 0 to -1
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 0 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 1 to -3
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -1 to 2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -1 to 0
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 1 to 1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 4 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -1 to -1
        rotation = 0
    }
    track {
        position = 4 to -3
        positions = listOf(0 to 0, -1 to 0, -2 to 0, -3 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                repeat()
                wait(6)
                repeat()
                wait(6)
                repeat()
                wait(6)
                repeat()
                wait(6)
                repeat()
                wait(6)
                repeat()
                wait(6)
                repeat()
                wait(6)
                repeat()
                wait(6)
                repeat()
                wait(6)
                repeat()
                wait(6)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                grab()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(6)
                repeat()
                wait(6)
                repeat()
                wait(6)
                repeat()
                wait(6)
                repeat()
                wait(6)
                repeat()
                wait(6)
                repeat()
                wait(6)
                repeat()
                wait(6)
                repeat()
                wait(6)
                repeat()
                wait(5)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(11)
                grab()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                back()
                pivotCounterClockwise()
                back()
                back()
                reset()
                wait(3)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(15)
                grab()
                pivotClockwise()
                drop()
                wait(2)
                grab()
                back()
                back()
                back()
                forward()
                reset()
            }
        }
        )
    }
}
