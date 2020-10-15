
solution {
    puzzle = "P096"
    name = "W3.5 6T"
    arm(ARM1) {
        number = 1
        position = -6 to -4
        rotation = -11
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = -9 to -3
        rotation = -7
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -8 to -7
        rotation = -5
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -8 to -6
        rotation = -5
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -4 to -2
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -5 to 1
        rotation = -7
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -2 to 0
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = -3 to 3
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = -8 to -5
        rotation = -10
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = -10
    }
    glyph(UNBONDER) {
        position = -7 to -4
        rotation = -9
    }
    glyph(UNBONDER) {
        position = -4 to -1
        rotation = -11
    }
    glyph(CALCIFICATION) {
        position = -10 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to 1
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = -10 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -11 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -6 to -2
        rotation = -7
    }
    io(OUTPUT) {
        index = 0
        position = -9 to -6
        rotation = -13
    }
    io(OUTPUT) {
        index = 1
        position = -5 to -1
        rotation = -5
    }
    io(OUTPUT) {
        index = 2
        position = -7 to -3
        rotation = -15
    }
    io(OUTPUT) {
        index = 3
        position = -2 to 1
        rotation = -8
    }
    track {
        position = -2 to 0
        positions = listOf(-1 to 3, 0 to 3, 1 to 2, 1 to 1, 1 to 0, 0 to 0, 0 to -1, -1 to -1, -1 to -2, -2 to -2)
    }
    track {
        position = -8 to -7
        positions = listOf(1 to 1, 1 to 2, 2 to 2, 2 to 3)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(4)
                grab()
                back()
                back()
                back()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                reset()
                wait(3)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(10)
                grab()
                retract()
                wait(1)
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(3)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                back()
                back()
                back()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                reset()
                wait(3)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(6)
                grab()
                back()
                pivotClockwise()
                wait(1)
                back()
                reset()
                wait(2)
                grab()
                back()
                rotateClockwise()
                reset()
                wait(2)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                grab()
                back()
                pivotClockwise()
                wait(1)
                back()
                reset()
                wait(3)
                grab()
                back()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(8)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotClockwise()
                extend()
                reset()
                wait(5)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                rotateClockwise()
                grab()
                pivotClockwise()
                reset()
                wait(2)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(14)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                forward()
                forward()
                reset()
                wait(4)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                forward()
                reset()
                wait(4)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                forward()
                reset()
                wait(6)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                reset()
                wait(4)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                reset()
                wait(3)
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(14)
                grab()
                pivotCounterClockwise()
                reset()
                wait(11)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
            }
        }
        )
    }
}
