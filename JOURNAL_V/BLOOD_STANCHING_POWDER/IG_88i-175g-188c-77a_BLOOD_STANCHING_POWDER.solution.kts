
solution {
    puzzle = "P087"
    name = "B F"
    arm(ARM6) {
        number = 1
        position = -4 to -3
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -7 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -6 to 0
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -2 to 2
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 0 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = -3 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -5 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = -6 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -6 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -7 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to 4
        rotation = 0
    }
    track {
        position = -2 to 2
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(10)
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                back()
                wait(1)
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                repeat()
                wait(2)
                repeat()
                wait(2)
                repeat()
                wait(2)
                repeat()
                wait(3)
                repeat()
                wait(2)
                repeat()
                wait(2)
                repeat()
            }
        }
        , 
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
                repeat()
                wait(2)
                repeat()
                wait(2)
                repeat()
                wait(2)
                repeat()
                wait(3)
                grab()
                rotateCounterClockwise()
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
            }
        }
        )
    }
}
