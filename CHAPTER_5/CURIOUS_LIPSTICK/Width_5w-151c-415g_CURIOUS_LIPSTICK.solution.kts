
solution {
    puzzle = "P041"
    name = "W5 3T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -3 to -4
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to -4
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 1 to -3
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 1 to -2
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -2 to 0
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 4 to 7
        rotation = 6
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 6 to 6
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = 7 to 4
        rotation = 8
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = 6 to 7
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 10
        position = 3 to 6
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 11
        position = 6 to 3
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 12
        position = 6 to 4
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = 4 to 2
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 3
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 5 to 4
        rotation = 2
    }
    glyph(BONDER) {
        position = 2 to 5
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -2 to -4
        rotation = 7
    }
    glyph(ANIMISMUS) {
        position = 5 to 6
        rotation = -2
    }
    glyph(DISPOSAL) {
        position = 8 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 5 to 7
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -4
        rotation = 0
    }
    track {
        position = -3 to -1
        positions = listOf(3 to 2, 2 to 2, 2 to 1, 1 to 1, 1 to 0)
    }
    track {
        position = 0 to -4
        positions = listOf(1 to 0, 1 to 1, 1 to 2, 0 to 2, 0 to 1)
    }
    track {
        position = 7 to 3
        positions = listOf(0 to -1, -1 to 0, -1 to 1, 0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(3)
                back()
                back()
                grab()
                back()
                back()
                back()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(5)
                grab()
                back()
                back()
                back()
                drop()
                back()
                back()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                back()
                back()
                wait(8)
                back()
                grab()
                back()
                back()
                back()
                pivotCounterClockwise()
                drop()
                back()
                back()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                back()
                forward()
                rotateClockwise()
                rotateClockwise()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                pivotCounterClockwise()
                drop()
                back()
                back()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                back()
                forward()
                rotateClockwise()
                rotateClockwise()
                back()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                back()
                back()
                grab()
                back()
                back()
                back()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(5)
                grab()
                back()
                back()
                back()
                drop()
                back()
                back()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                back()
                back()
                back()
                drop()
                back()
                back()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                back()
                back()
                wait(8)
                back()
                grab()
                back()
                back()
                back()
                pivotCounterClockwise()
                drop()
                back()
                back()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                back()
                forward()
                rotateClockwise()
                rotateClockwise()
                back()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                back()
                back()
                grab()
                back()
                back()
                back()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(21)
                forward()
                grab()
                back()
                back()
                back()
                back()
                forward()
                forward()
                forward()
                reset()
                wait(14)
                repeat()
                wait(23)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
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
                repeat()
                wait(3)
                repeat()
                wait(3)
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
                repeat()
                wait(3)
                repeat()
                wait(3)
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
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
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
                wait(2)
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
                repeat()
                wait(3)
                repeat()
                wait(3)
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
                repeat()
                wait(3)
                repeat()
                wait(3)
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
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                grab()
                back()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                grab()
                back()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(5)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(11) {
                wait(9)
                grab()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                pivotClockwise()
                back()
                drop()
                wait(3)
                forward()
                grab()
                back()
                pivotClockwise()
                reset()
                wait(6)
                repeat()
                wait(23)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                wait(7)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(6)
                reset()
                wait(15)
                repeat()
                wait(23)
                repeat()
            }
        }
        , 
        {
            sequence(12) {
                wait(18)
                grab()
                back()
                pivotClockwise()
                reset()
                wait(20)
                repeat()
                wait(23)
                repeat()
            }
        }
        )
    }
}
