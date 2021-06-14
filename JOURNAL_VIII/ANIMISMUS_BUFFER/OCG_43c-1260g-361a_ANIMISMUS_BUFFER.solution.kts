
solution {
    puzzle = "P104"
    name = "B CI156 2T"
    arm(ARM1) {
        number = 1
        position = 5 to -1
        rotation = 7
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 6 to -1
        rotation = 7
        size = 3
    }
    arm(PISTON) {
        number = 3
        position = 7 to -1
        rotation = 6
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = 7 to 4
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 6 to 5
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 5 to 5
        rotation = -3
        size = 3
    }
    arm(ARM6) {
        number = 7
        position = 2 to 5
        rotation = -1
        size = 3
    }
    arm(ARM6) {
        number = 8
        position = 6 to 4
        rotation = -2
        size = 3
    }
    arm(ARM3) {
        number = 9
        position = 7 to -2
        rotation = 1
        size = 3
    }
    arm(ARM2) {
        number = 10
        position = 6 to -2
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = -2 to 3
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 12
        position = -2 to 5
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 13
        position = -1 to 5
        rotation = -1
        size = 3
    }
    arm(ARM6) {
        number = 14
        position = -4 to 2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 15
        position = -3 to -1
        rotation = 0
        size = 2
    }
    arm(ARM6) {
        number = 16
        position = -3 to 1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 17
        position = -2 to 1
        rotation = 0
        size = 2
    }
    arm(ARM6) {
        number = 18
        position = 2 to -2
        rotation = 1
        size = 3
    }
    arm(ARM3) {
        number = 19
        position = 1 to -4
        rotation = 2
        size = 2
    }
    arm(ARM6) {
        number = 20
        position = 6 to -4
        rotation = 3
        size = 3
    }
    arm(ARM6) {
        number = 21
        position = 10 to 4
        rotation = -2
        size = 3
    }
    arm(ARM6) {
        number = 22
        position = 9 to 4
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 23
        position = 15 to -1
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 24
        position = 16 to -2
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 25
        position = 17 to -1
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 26
        position = 14 to -4
        rotation = 1
        size = 3
    }
    arm(ARM6) {
        number = 27
        position = 15 to -4
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 28
        position = 14 to -3
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 29
        position = 8 to -2
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 30
        position = 8 to 2
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = 11 to -3
        rotation = 0
    }
    glyph(BONDER) {
        position = 9 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 4 to -4
        rotation = 0
    }
    glyph(BONDER) {
        position = 4 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = 10 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 11 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 14 to -1
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 9 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 10 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to -3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 9 to 1
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 12 to 1
        rotation = 4
    }
    glyph(DUPLICATION) {
        position = 4 to 0
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 1 to 0
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 2 to 0
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 10 to -6
        rotation = 3
    }
    glyph(ANIMISMUS) {
        position = 11 to -1
        rotation = -1
    }
    glyph(ANIMISMUS) {
        position = -2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 6 to 1
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = 6 to -6
        rotation = 1
    }
    track {
        position = 2 to -3
        positions = listOf(-2 to 0, -1 to 0, 0 to 0, 0 to 1)
    }
    track {
        position = 14 to -4
        positions = listOf(0 to 1, 1 to 0, 1 to -1, 0 to 0)
    }
    track {
        position = 9 to 5
        positions = listOf(0 to 0, 1 to -1)
    }
    track {
        position = -3 to 1
        positions = listOf(0 to 1, 1 to 0, 0 to 0)
    }
    track {
        position = 7 to -3
        positions = listOf(-1 to -1, 0 to -1, 0 to 0, -1 to 0, -2 to 1, -2 to 2, -1 to 2, 0 to 2, 1 to 1)
    }
    track {
        position = 7 to 5
        positions = listOf(1 to -2, 1 to -1, 0 to 0, 0 to -1, -1 to 0, -2 to 0)
    }
    track {
        position = -3 to 4
        positions = listOf(0 to 0, 0 to 1, 1 to 1)
    }
    track {
        position = 16 to -1
        positions = listOf(0 to 1, 0 to 0, 0 to -1)
    }
    track {
        position = -4 to -1
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(17) {
                wait(8)
                grab()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(13) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(23) {
                wait(6)
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(11) {
                wait(4)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                rotateClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(12) {
                wait(14)
                grab()
                back()
                drop()
            }
        }
        , 
        {
            sequence(24) {
                wait(16)
                grab()
                rotateCounterClockwise()
                back()
                back()
                drop()
            }
        }
        , 
        {
            sequence(25) {
                wait(26)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                back()
            }
        }
        , 
        {
            sequence(29) {
                wait(13)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(8)
                back()
                extend()
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(8)
                back()
                wait(7)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(6) {
                wait(17)
                back()
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(17)
                back()
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(8)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(10)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(12)
                grab()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(14)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(15) {
                wait(6)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(19) {
                wait(11)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(14) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(18) {
                wait(10)
                grab()
                back()
                back()
                back()
                wait(1)
                rotateClockwise()
                drop()
                forward()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(20) {
                wait(14)
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                back()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
                wait(3)
                back()
            }
        }
        , 
        {
            sequence(21) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(22) {
                wait(12)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(30) {
                wait(14)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(16) {
                wait(11)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(27) {
                wait(13)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(28) {
                wait(9)
                back()
                grab()
                rotateCounterClockwise()
                drop()
                wait(4)
                forward()
            }
        }
        , 
        {
            sequence(26) {
                wait(6)
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                wait(5)
                forward()
            }
        }
        )
    }
}
