
solution {
    puzzle = "P099"
    name = "B S 12T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -1 to -1
        rotation = -6
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -1 to 5
        rotation = -6
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -1 to 2
        rotation = -6
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 2 to 2
        rotation = -6
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 2 to 1
        rotation = -5
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 4 to -2
        rotation = -5
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 3 to -1
        rotation = -2
        size = 2
    }
    glyph(UNBONDER) {
        position = -1 to 3
        rotation = -5
    }
    glyph(UNBONDER) {
        position = 2 to -2
        rotation = -7
    }
    glyph(UNBONDER) {
        position = 3 to 2
        rotation = -7
    }
    glyph(DUPLICATION) {
        position = -1 to 0
        rotation = -5
    }
    glyph(DUPLICATION) {
        position = 0 to -2
        rotation = -6
    }
    glyph(PROJECTION) {
        position = 2 to 3
        rotation = -4
    }
    glyph(PURIFICATION) {
        position = 0 to 3
        rotation = -7
    }
    glyph(UNIFICATION) {
        position = 1 to 0
        rotation = -6
    }
    io(INPUT) {
        index = 0
        position = 5 to 0
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 6
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -3 to 5
        rotation = -8
    }
    io(INPUT) {
        index = 2
        position = -3 to 6
        rotation = -8
    }
    track {
        position = 0 to 5
        positions = listOf(0 to -1, 0 to 0, -1 to 0)
    }
    track {
        position = 2 to 1
        positions = listOf(0 to 0, 1 to -1, 2 to -2, 2 to -3, 1 to -3, 1 to -2)
    }
    track {
        position = -2 to 2
        positions = listOf(1 to 0, 2 to 0)
    }
    tape {
        parallel(
        {
            sequence(6) {
                grab()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                pivotClockwise()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                back()
                back()
                reset()
                wait(3)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                grab()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                pivotClockwise()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                back()
                back()
                drop()
                rotateClockwise()
                forward()
                forward()
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(2)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(9)
                grab()
                rotateClockwise()
                back()
                forward()
                drop()
                rotateClockwise()
                back()
                grab()
                back()
                drop()
                forward()
                forward()
                reset()
                wait(2)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                grab()
                rotateClockwise()
                back()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                forward()
                forward()
                back()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                wait(9)
                rotateClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(11)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                wait(1)
                back()
                wait(1)
                back()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                forward()
                drop()
                forward()
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                grab()
                rotateCounterClockwise()
                wait(1)
                back()
                wait(1)
                back()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                forward()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                forward()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                back()
                wait(2)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
                wait(14)
                repeat()
            }
        }
        )
    }
}
