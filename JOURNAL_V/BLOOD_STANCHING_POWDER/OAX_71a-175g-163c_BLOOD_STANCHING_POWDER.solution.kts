
solution {
    puzzle = "P087"
    name = "B X S 6T"
    arm(ARM6) {
        number = 1
        position = -1 to -3
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -4 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -3 to 0
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 1 to 2
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = -3 to -3
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 3
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = 4 to 1
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -3 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 5 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -4 to -3
        rotation = 0
    }
    track {
        position = 1 to 3
        positions = listOf(0 to -1, 1 to -2, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                repeat()
                wait(2)
                repeat()
                wait(2)
                repeat()
                wait(2)
                repeat()
                wait(3)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                wait(1)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                grab()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(14)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(9)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(9)
                grab()
                back()
                reset()
                wait(1)
                grab()
                forward()
                rotateClockwise()
                back()
                pivotClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                back()
                wait(2)
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                forward()
                reset()
                wait(2)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
            }
        }
        )
    }
}
