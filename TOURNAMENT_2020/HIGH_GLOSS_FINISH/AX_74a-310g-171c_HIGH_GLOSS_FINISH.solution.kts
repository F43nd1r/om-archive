
solution {
    puzzle = "w2501728349"
    name = "B X S F F43ND1R"
    arm(ARM1) {
        number = 1
        position = -1 to -3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 0 to -4
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 4 to -4
        rotation = 7
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 5 to -3
        rotation = 7
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 2 to -1
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -4 to 1
        rotation = 5
        size = 2
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 7
        position = 1 to -6
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = -3 to 3
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = 2 to 3
        rotation = -3
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -2 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to 3
        rotation = 3
    }
    glyph(UNBONDER) {
        position = 4 to -2
        rotation = 7
    }
    glyph(DUPLICATION) {
        position = 1 to -5
        rotation = 1
    }
    glyph(PROJECTION) {
        position = 2 to -2
        rotation = -2
    }
    glyph(DISPOSAL) {
        position = 2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to -1
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -5
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 5 to -2
        rotation = -6
    }
    track {
        position = -1 to -3
        positions = listOf(1 to -1, 0 to 0, 1 to 0)
    }
    track {
        position = -3 to 3
        positions = listOf(-1 to -2, 0 to -2, 0 to -1, 0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(7) {
                wait(13)
                rotateClockwise()
                wait(6)
                rotateCounterClockwise()
                wait(3)
                rotateClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(5)
                forward()
                wait(2)
                grab()
                back()
                drop()
                forward()
                wait(3)
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(3)
                grab()
                forward()
                forward()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                forward()
                pivotCounterClockwise()
                wait(3)
                back()
                forward()
                pivotCounterClockwise()
                wait(1)
                back()
                forward()
                wait(1)
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(14)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(4)
                repeat()
                wait(3)
                repeat()
                wait(4)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(2)
                repeat()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(10)
                back()
                grab()
                forward()
                rotateCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                forward()
                reset()
                wait(2)
                back()
                grab()
                rotateCounterClockwise()
                forward()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                forward()
                forward()
                drop()
                wait(1)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                reset()
            }
        }
        )
    }
}
