
solution {
    puzzle = "P055"
    name = "OVERLAP AREA"
    arm(PISTON) {
        number = 1
        position = -1 to -1
        rotation = 0
        size = 2
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = 0 to -3
        rotation = 5
        size = 1
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = -2
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = -3
    }
    glyph(UNBONDER) {
        position = 1 to -2
        rotation = -4
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 0 to -2
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    track {
        position = -1 to -1
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                retract()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotClockwise()
                extend()
                extend()
                forward()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(7)
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(7)
                rotateClockwise()
            }
        }
        )
    }
}
