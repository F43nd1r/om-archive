
solution {
    puzzle = "P071"
    name = "OVERLAP AG"
    arm(ARM1) {
        number = 1
        position = 2 to -1
        rotation = -4
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = -1 to 0
        rotation = -1
        size = 1
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 1 to 1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = -1 to 1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 0 to -1
        rotation = 0
    }
    glyph(UNIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to 0
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 0
        rotation = 0
    }
    track {
        position = 1 to 1
        positions = listOf(1 to -1, 1 to -2)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                reset()
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(8)
                rotateCounterClockwise()
                reset()
                wait(9)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(2)
                repeat()
            }
        }
        )
    }
}
