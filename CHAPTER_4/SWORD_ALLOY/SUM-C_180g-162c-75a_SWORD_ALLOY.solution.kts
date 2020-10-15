
solution {
    puzzle = "P033"
    name = "B X S 6T"
    arm(ARM6) {
        number = 1
        position = -3 to 5
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -1 to 3
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -3 to 1
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = 0 to 3
        rotation = 5
    }
    glyph(MULTI_BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -2 to 5
        rotation = -2
    }
    glyph(PURIFICATION) {
        position = 0 to 2
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -3 to 6
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -13 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 3
        rotation = 0
    }
    track {
        position = -3 to 1
        positions = listOf(1 to 1, 0 to 1, 0 to 0, 1 to 0)
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
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
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
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                grab()
                rotateClockwise()
                drop()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(14)
                grab()
                forward()
                forward()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                rotateClockwise()
                forward()
                reset()
                wait(3)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(10)
                grab()
                forward()
                forward()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                back()
                reset()
            }
        }
        )
    }
}
