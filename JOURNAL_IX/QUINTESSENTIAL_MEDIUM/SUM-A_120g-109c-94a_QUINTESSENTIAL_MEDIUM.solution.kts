
solution {
    puzzle = "P107"
    name = "B X S 6T"
    arm(ARM1) {
        number = 1
        position = 2 to 1
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -2 to 2
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 3 to 1
        rotation = 4
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 2
    }
    glyph(BONDER) {
        position = 1 to 2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to -1
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 4
        rotation = -4
    }
    track {
        position = 3 to 1
        positions = listOf(0 to 0, 0 to -1, -1 to 0)
    }
    track {
        position = 0 to 2
        positions = listOf(0 to 0, -1 to 0, -2 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                pivotClockwise()
                wait(2)
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                back()
                drop()
                reset()
                wait(2)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                pivotClockwise()
                wait(2)
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                back()
                drop()
                reset()
                wait(3)
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(8)
                back()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                pivotClockwise()
                wait(2)
                rotateClockwise()
                back()
                reset()
                wait(6)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                back()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                pivotClockwise()
                wait(1)
                rotateClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                back()
                back()
                grab()
                pivotClockwise()
                forward()
                forward()
                reset()
                wait(2)
                repeat()
                wait(8)
                repeat()
                wait(8)
                repeat()
                wait(8)
                repeat()
                wait(8)
                repeat()
                wait(8)
                repeat()
                wait(8)
                repeat()
                wait(8)
                repeat()
                wait(8)
                repeat()
                wait(8)
                repeat()
                wait(8)
                back()
                back()
                grab()
                forward()
                wait(2)
                pivotClockwise()
                forward()
                reset()
            }
        }
        )
    }
}
