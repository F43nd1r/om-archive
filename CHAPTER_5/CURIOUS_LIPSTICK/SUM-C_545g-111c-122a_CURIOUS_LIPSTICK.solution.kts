
solution {
    puzzle = "P041"
    name = "B CG 6T"
    arm(ARM1) {
        number = 1
        position = 0 to -7
        rotation = 7
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 1 to -6
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -5 to -1
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -5 to -2
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -3 to -4
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 2 to -7
        rotation = 2
        size = 2
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 7
        position = 5 to -5
        rotation = 3
        size = 1
    }
    arm(ARM6) {
        number = 8
        position = 2 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = 3 to -1
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 10
        position = 3 to 0
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 11
        position = -1 to 1
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 12
        position = -2 to 4
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = 2 to 1
        rotation = 4
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -5
        rotation = 2
    }
    glyph(BONDER) {
        position = -2 to -2
        rotation = 2
    }
    glyph(BONDER) {
        position = 0 to -3
        rotation = 2
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 3
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 1 to -2
        rotation = 3
    }
    glyph(MULTI_BONDER) {
        position = -2 to 1
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 4 to -5
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 4 to -4
        rotation = 2
    }
    glyph(ANIMISMUS) {
        position = -1 to -5
        rotation = 3
    }
    glyph(ANIMISMUS) {
        position = 2 to 0
        rotation = 3
    }
    glyph(DISPOSAL) {
        position = -3 to -6
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -6 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to -5
        rotation = 0
    }
    track {
        position = -1 to 1
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = 1 to -6
        positions = listOf(0 to 0, -1 to 0, -1 to -1, -2 to -1)
    }
    track {
        position = 2 to -5
        positions = listOf(0 to 0, 0 to -1, 0 to -2, 1 to -2)
    }
    track {
        position = -5 to -2
        positions = listOf(0 to 0, -1 to 1, 0 to 1)
    }
    track {
        position = 2 to 1
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(8) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
                wait(3)
                grab()
                rotateClockwise()
                drop()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(2)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(6)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(14)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
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
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                forward()
                rotateCounterClockwise()
                back()
                reset()
                wait(3)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(5)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
            }
        }
        , 
        {
            sequence(11) {
                wait(6)
                grab()
                rotateClockwise()
                rotateClockwise()
                wait(3)
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                back()
                forward()
                drop()
                back()
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
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                rotateClockwise()
                wait(1)
                forward()
                rotateCounterClockwise()
                reset()
                wait(4)
                grab()
                back()
                back()
                pivotClockwise()
                reset()
                wait(3)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
            }
        }
        , 
        {
            sequence(12) {
                wait(11)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(8)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(9)
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                forward()
                pivotClockwise()
                drop()
                wait(3)
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
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                wait(4)
                forward()
                reset()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                wait(1)
                back()
                reset()
                wait(1)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
            }
        }
        , 
        {
            sequence(13) {
                wait(5)
                grab()
                rotateClockwise()
                forward()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                forward()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                forward()
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
                forward()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                forward()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                wait(2)
                forward()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                forward()
                reset()
                wait(3)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                back()
                reset()
                wait(1)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
            }
        }
        )
    }
}
