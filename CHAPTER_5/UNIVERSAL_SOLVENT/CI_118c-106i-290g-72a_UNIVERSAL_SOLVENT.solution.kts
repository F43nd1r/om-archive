
solution {
    puzzle = "P043"
    name = "B S 2 FG"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 2 to -5
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 3 to -2
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 1 to 0
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -2 to 1
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 1 to -3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 0 to -5
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -1 to -6
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -2 to -5
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = -3 to -6
        rotation = 6
        size = 1
    }
    glyph(BONDER) {
        position = -1 to -4
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to -5
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 1 to -4
        rotation = 2
    }
    glyph(PURIFICATION) {
        position = 2 to -2
        rotation = 7
    }
    glyph(ANIMISMUS) {
        position = -2 to 2
        rotation = 6
    }
    io(INPUT) {
        index = 0
        position = -2 to -6
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -6 to -4
        rotation = 4
    }
    io(INPUT) {
        index = 1
        position = 1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -1 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = -3 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 4
        position = 3 to -3
        rotation = 0
    }
    track {
        position = 0 to 1
        positions = listOf(0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(9)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(10)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(22)
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(24)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(26)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(17)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                wait(1)
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
