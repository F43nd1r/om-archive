
solution {
    puzzle = "P033"
    name = "B F"
    arm(ARM1) {
        number = 1
        position = -7 to -2
        rotation = 3
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = -9 to -4
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -7 to -6
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = -11 to -3
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = -10 to 0
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = -10 to -3
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -8 to -6
        rotation = 1
    }
    io(INFINITE) {
        index = 0
        position = -9 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -7 to -7
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -8 to -4
        rotation = 0
    }
    track {
        position = -8 to -3
        positions = listOf(0 to 0, 1 to 0, 1 to 1, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(2) {
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
            sequence(1) {
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
            }
        }
        )
    }
}
