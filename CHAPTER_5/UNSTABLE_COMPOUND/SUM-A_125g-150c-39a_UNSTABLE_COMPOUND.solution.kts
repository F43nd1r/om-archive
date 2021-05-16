
solution {
    puzzle = "P040"
    name = "B X S F"
    arm(ARM6) {
        number = 1
        position = 0 to 2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -4 to 0
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -3 to -1
        rotation = -1
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -1 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -1 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to 3
        rotation = 0
    }
    track {
        position = -4 to 1
        positions = listOf(0 to 0, 0 to -1, -1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                back()
                forward()
                pivotClockwise()
                pivotClockwise()
                back()
                forward()
                pivotClockwise()
                pivotClockwise()
                back()
                forward()
                pivotClockwise()
                forward()
                back()
                pivotClockwise()
                pivotClockwise()
                forward()
                back()
                pivotClockwise()
                pivotClockwise()
                forward()
                back()
                reset()
            }
        }
        )
    }
}
