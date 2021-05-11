
solution {
    puzzle = "P040"
    name = "WORLD RECORD 314 (Copy) (Copy)"
    arm(ARM1) {
        number = 1
        position = -4 to 0
        rotation = 5
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = 0 to 2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -3 to -1
        rotation = 5
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to 0
        rotation = -3
    }
    glyph(CALCIFICATION) {
        position = -1 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -1
        rotation = 9
    }
    io(INPUT) {
        index = 1
        position = 0 to 3
        rotation = 0
    }
    track {
        position = -3 to 0
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                back()
                forward()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                forward()
                pivotCounterClockwise()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                forward()
                pivotCounterClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                wait(5)
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                wait(4)
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                wait(4)
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
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
                wait(7)
                repeat()
                wait(2)
                repeat()
                wait(4)
                repeat()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
