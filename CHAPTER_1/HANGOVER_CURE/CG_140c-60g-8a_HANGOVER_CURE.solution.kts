
solution {
    puzzle = "P013"
    name = "B AA"
    arm(PISTON) {
        number = 1
        position = 2 to -1
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 5
    }
    glyph(CALCIFICATION) {
        position = 3 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                retract()
                rotateCounterClockwise()
                reset()
                wait(2)
                repeat()
                wait(5)
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
