
solution {
    puzzle = "P032"
    name = "H2/87C/280G/32A"
    arm(PISTON) {
        number = 1
        position = 7 to 0
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 10 to -1
        rotation = 6
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 6 to -1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 11 to 0
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 5 to -1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 12 to 0
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = 4 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 13 to -1
        rotation = -3
    }
    glyph(CALCIFICATION) {
        position = 10 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 7 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 15 to 0
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 9 to -1
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = 11 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 0
        rotation = 3
    }
    io(INPUT) {
        index = 1
        position = 6 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 15 to -1
        rotation = -3
    }
    track {
        position = 5 to -1
        positions = listOf(1 to 0, 0 to 0, -1 to 0, -2 to 0)
    }
    track {
        position = 12 to 0
        positions = listOf(-1 to 0, 0 to 0, 1 to 0, 2 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
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
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
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
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
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
                wait(3)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
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
                forward()
                forward()
                drop()
                back()
                back()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
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
                wait(3)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
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
                forward()
                forward()
                drop()
                back()
                back()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(8)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                forward()
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
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                wait(1)
                back()
                back()
            }
        }
        , 
        {
            sequence(6) {
                wait(8)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                forward()
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
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                wait(1)
                back()
                back()
            }
        }
        )
    }
}
